package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;

public class ShapeCollectorTestSuite {

    private ShapeCollector shapeCollector;

    @Before
    public void initCollector(){
        this.shapeCollector = new ShapeCollector();
    }

    @Test
    public void testAddOneCircleToCollector(){

        //Given
        final Shape shape = new Circle(20);
        shapeCollector.addFigure(shape);

        //When
        final Shape shapeFromCollector = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(shape, shapeFromCollector);

    }

    @Test
    public void testAddMoreThanOneCirclesToCollector(){

        //Given
        final Shape shape1 = new Circle(20);
        final Shape shape2 = new Circle(15);
        shapeCollector.addFigure(shape1);
        shapeCollector.addFigure(shape2);

        //When
        final Shape shapeFromCollector1 = shapeCollector.getFigure(0);
        final Shape shapeFromCollector2 = shapeCollector.getFigure(1);

        //Then
        Assert.assertEquals(shape1, shapeFromCollector1);
        Assert.assertEquals(shape2, shapeFromCollector2);
    }

    @Test
    public void testAddOneTriangleToCollector(){

        //Given
        final Shape shape = new Triangle(5.0, 4.5);
        shapeCollector.addFigure(shape);

        //When
        final Shape shapeFromCollector = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(shape, shapeFromCollector);
    }

    @Test
    public void testAddMoreThanOneTrianglesToCollector(){

        //Given
        final Shape shape1 = new Triangle(10, 7.5);
        final Shape shape2 = new Triangle(4, 2);
        shapeCollector.addFigure(shape1);
        shapeCollector.addFigure(shape2);

        //When
        final Shape shapeFromCollector1 = shapeCollector.getFigure(0);
        final Shape shapeFromCollector2 = shapeCollector.getFigure(1);

        //Then
        Assert.assertEquals(shape1, shapeFromCollector1);
        Assert.assertEquals(shape2, shapeFromCollector2);

    }

    @Test
    public void testAddOneSquareToCollector(){

        //Given
        final Shape shape = new Square(10.2);
        shapeCollector.addFigure(shape);

        //When
        final Shape shapeFromCollector = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(shape, shapeFromCollector);

    }

    @Test
    public void testAddMoreThanOneSquaresToCollector(){

        //Given
        final Shape shape1 = new Square(4);
        final Shape shape2 = new Square(10.2);
        shapeCollector.addFigure(shape1);
        shapeCollector.addFigure(shape2);

        //When
        final Shape shapeFromCollector1 = shapeCollector.getFigure(0);
        final Shape shapeFromCollector2 = shapeCollector.getFigure(1);

        //Then
        Assert.assertEquals(shape1, shapeFromCollector1);
        Assert.assertEquals(shape2, shapeFromCollector2);
    }

    @Test
    public void testRemoveOneTriangleFromCollector(){

        //Given
        final Shape shape = new Triangle(5, 3.8);
        shapeCollector.addFigure(shape);

        //When
        boolean result = shapeCollector.removeFigure(shape);

        //Then
        assertTrue(result);
    }

    @Test
    public void testRemoveMoreThanOneTrianglesFromCollector(){

        //Given
        final Shape shape1 = new Triangle(5, 3.8);
        final Shape shape2 = new Triangle(8, 12);
        shapeCollector.addFigure(shape1);
        shapeCollector.addFigure(shape2);

        //When
        boolean result = shapeCollector.removeFigure(shape1);
        boolean result2 = shapeCollector.removeFigure(shape2);

        //Then
        assertTrue(result);
        assertTrue(result2);
    }

    @Test
    public void testRemoveOneCircleFromCollector(){

        //Given
        final Shape shape = new Circle(2);
        shapeCollector.addFigure(shape);

        //When
        boolean result = shapeCollector.removeFigure(shape);

        //Then
        assertTrue(result);
    }

    @Test
    public void testRemoveMoreThanOneCirclesFromCollector(){

        //Given
        final Shape shape1 = new Circle(2);
        final Shape shape2 = new Circle(8);
        shapeCollector.addFigure(shape1);
        shapeCollector.addFigure(shape2);

        //When
        boolean result = shapeCollector.removeFigure(shape1);
        boolean result2 = shapeCollector.removeFigure(shape2);

        //Then
        assertTrue(result);
        assertTrue(result2);

    }

    @Test
    public void testRemoveOneSquareFromCollector(){

        //Given
        final Shape shape = new Square(4);
        shapeCollector.addFigure(shape);

        //When
        boolean result = shapeCollector.removeFigure(shape);

        //Then
        assertTrue(result);
    }

    @Test
    public void testRemoveMoreThanOneSquaresFromCollector(){

        //Given
        final Shape shape1 = new Square(4);
        final Shape shape2 = new Square(8);
        shapeCollector.addFigure(shape1);
        shapeCollector.addFigure(shape2);

        //When
        boolean result = shapeCollector.removeFigure(shape1);
        boolean result2 = shapeCollector.removeFigure(shape2);

        //Then
        assertTrue(result);
        assertTrue(result2);

    }

    @Test
    public void testShowSingleCircleFromShapeCollector(){

        //Given
        final Shape shape = new Circle(4);
        shapeCollector.addFigure(shape);

        //When
        final String figuresStringFromCollector = shapeCollector.showFigures(shape);

        //Then
        Assert.assertEquals("Circle, field: 12.566370614359172", figuresStringFromCollector);

    }

    @Test
    public void testShowTwoCircleFromShapeCollector(){

        //Given
        final Shape shape1 = new Circle(4);
        final Shape shape2 = new Circle(8);
        shapeCollector.addFigure(shape1);
        shapeCollector.addFigure(shape2);

        //When
        final String figuresStringFromCollector1 = shapeCollector.showFigures(shape1);
        final String figuresStringFromCollector2 = shapeCollector.showFigures(shape2);

        //Then
        Assert.assertEquals("Circle, field: 12.566370614359172", figuresStringFromCollector1);
        Assert.assertEquals("Circle, field: 25.132741228718345", figuresStringFromCollector2);

    }

    @Test
    public void testShowOneTriangleFromShapeCollector(){

        //Given
        final Shape shape = new Triangle(5, 10);
        shapeCollector.addFigure(shape);

        //When
        final String figuresStringFromCollector = shapeCollector.showFigures(shape);

        //Then
        Assert.assertEquals("Triangle, field: 25.0", figuresStringFromCollector);
    }

    @Test
    public void testShowTwoTrianglesFromShapeCollector(){

        //Given
        final Shape shape1 = new Triangle(5, 10);
        final Shape shape2 = new Triangle(5, 10);
        shapeCollector.addFigure(shape1);
        shapeCollector.addFigure(shape2);

        //When
        final String figuresStringFromCollector1 = shapeCollector.showFigures(shape1);
        final String figuresStringFromCollector2 = shapeCollector.showFigures(shape2);

        //Then
        Assert.assertEquals("Triangle, field: 25.0", figuresStringFromCollector1);
        Assert.assertEquals("Triangle, field: 25.0", figuresStringFromCollector2);
    }

    @Test
    public void testShowOneSquareFromShapeCollector(){

        //Given
        final Shape shape = new Square(5);
        shapeCollector.addFigure(shape);

        //When
        final String figuresStringFromCollector = shapeCollector.showFigures(shape);

        //Then
        Assert.assertEquals("Square, field: 25.0", figuresStringFromCollector);
    }

    @Test
    public void testShowTwoSquareFromShapeCollector(){

        //Given
        final Shape shape1 = new Square(5);
        final Shape shape2 = new Square(5);
        shapeCollector.addFigure(shape1);
        shapeCollector.addFigure(shape2);

        //When
        final String figuresStringFromCollector1 = shapeCollector.showFigures(shape1);
        final String figuresStringFromCollector2 = shapeCollector.showFigures(shape1);

        //Then
        Assert.assertEquals("Square, field: 25.0", figuresStringFromCollector1);
        Assert.assertEquals("Square, field: 25.0", figuresStringFromCollector2);
    }

}
