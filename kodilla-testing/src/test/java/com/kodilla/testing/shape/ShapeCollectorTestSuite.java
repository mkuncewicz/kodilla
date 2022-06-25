package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;

public class ShapeCollectorTestSuite {

    @BeforeEach
    public void before() {
        System.out.println("Test Case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Test Suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Test Suite: end");
    }

    @DisplayName("when tried add new Figure, " +
            "then list size it should be equal to one")
    @Test
    void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Square();
        //When
        shapeCollector.addFigure(shape);
        //Then
        Assertions.assertEquals(1, shapeCollector.list.size());
    }
    @DisplayName("when we tried remove Figure, "+
            "then list size it should decrease by one")
    @Test
    void testRemoveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Circle();
        //When
        shapeCollector.addFigure(shape);
        Assertions.assertEquals(1, shapeCollector.list.size());
        shapeCollector.removeFigure(shape);
        //Then
        Assertions.assertEquals(0,shapeCollector.list.size());

    }
    @DisplayName("when use GiveFigure "+
    "then return correct figure")
    @Test
    void  testGiveFigure(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Triangle();
        //When
        shapeCollector.addFigure(shape);
        //Then
        Shape shape2 = shapeCollector.getFigure(0);
        Assertions.assertTrue(shape2 == shape);
    }

    @DisplayName("when use GiveFigure with minus index "+
            "then return null")
    @Test
    void testGiveFigureMinusIndex(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Triangle();
        //When
        shapeCollector.addFigure(shape);
        //Then
        Shape shape2 = shapeCollector.getFigure(-1);
        Assertions.assertNull(shape2);

    }

    @DisplayName("when use GiveFigure with over-size index "+
            "then return null")
    @Test
    void testGiveFigureOverSizeIndex(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape = new Triangle();
        //When
        shapeCollector.addFigure(shape);
        //Then
        Shape shape2 = shapeCollector.getFigure(2);
        Assertions.assertNull(shape2);
    }
    @DisplayName("when use showFigures "+
    "then should return correct String with name of Figures")
    @Test
    void testShowFigures(){
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape1 = new Triangle();
        shapeCollector.addFigure(shape1);
        shapeCollector.addFigure(shape1);
        //When
        String result = shapeCollector.showFigures();
        //Then
        Assertions.assertTrue(result.equals("Triangle, Traingle."));

    }

}
