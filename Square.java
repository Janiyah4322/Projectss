public class Square {

   private int side;
   private String color;
   private int area;
   private int perimeter;

   // Constructor
   public Square(int side, String color) {
      this.side = side;
      this.color = color;
      updateCalculations(); // Calculate area and perimeter
   }

   // Update area and perimeter
   private void updateCalculations() {
      area = side * side;
      perimeter = 4 * side;
   }

   // Getters
   public int getSide() {
      return side;
   }

   public String getColor() {
      return color;
   }

   public int getArea() {
      return area;
   }

   public int getPerimeter() {
      return perimeter;
   }

   @Override
   public String toString() {
      return "Square side: " + side +
             "\nColor: " + color +
             "\nArea: " + area +
             "\nPerimeter: " + perimeter;
   }
}

