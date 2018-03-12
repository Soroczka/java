package com.kodilla.good.patterns.challenges.food2door.service;

import com.kodilla.good.patterns.challenges.food2door.OrderDTO;

public class ProductOrderService {

    private final OrderService orderService;
    private final OrderRepository orderRepository;
    private final InformationService informationService;

    public ProductOrderService(final OrderService orderService,
                               final OrderRepository orderRepository,
                               final InformationService informationService) {
        this.orderService = orderService;
        this.orderRepository = orderRepository;
        this.informationService = informationService;
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
