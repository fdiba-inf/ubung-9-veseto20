package exercise9;

public class Ellipse {
  private Point startPoint;
  private double height;
  private double width;

  public Ellipse(){
    this.startPoint = new Point(0,0);
    this.height = 1;
    this.width = 1;
  }

  public Ellipse(Point startPoint, double height, double width){
    this.startPoint = new Point(startPoint);
    this.height = height;
    this.width = width;
  }

  public Ellipse (Ellipse otherEllipse){
    this.startPoint = new Point(otherEllipse);
    this.height = otherEllipse.height;
    this.width = otherEllipse.width;
  }

  public boolean isValid(){
    return width>0 && height>0;
  }

  public void initialize(){
     do {
            System.out.println("Start point: ");
            startPoint.initialize();
            System.out.print("Enter height: ");
            this.height = Utils.INPUT.nextDouble();
            System.out.print("Enter width: ");
            this.width = Utils.INPUT.nextDouble();
        } while (!isValid());
  }

   public double calculatePerimeter(){
     return Math.PI*(3*(a+b)-Math.sqrt(((3*a+b))+(a+3*b))); 

   }
   public double calculateArea(){
     return Math.PI*height*width; 
   } 

   public String getType(){
     return (utils.equals(height,width)) ? "Circle" : "Ellipse"; 
   }




}
