abstract class CShape
{
   protected String color;
   public CShape(String str)
   {
      color=str;
   }
   public abstract void show();
}
class CRectangle extends CShape
{
   int width,height;
   public CRectangle(int w,int h)
   {
      super("Green");
      width=w;
      height=h;
   }
   public void show()
   {
      System.out.print("color="+color+", ");
      System.out.print("width="+width+", ");
      System.out.print("height="+height+", ");
      System.out.print("area="+width*height);
   }
}

public class J2
{
   public static void main(String args[])
   {
      CRectangle rect=new CRectangle(5,7);
      rect.show();

   }
}
