package com.kodilla.good.patterns.challenges.shop;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                               final OrderService orderService,
                               final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDTO process (OrderRequest orderRequest){
        boolean isOrdered = orderService.order(orderRequest);

        if(isOrdered){
            informationService.inform(orderRequest.getCustomer());
            orderRepository.createOrder(orderRequest);
            return new OrderDTO(orderRequest.getCustomer(), true);
        } else {
            return new OrderDTO(orderRequest.getCustomer(), false);
        }

    }

}
