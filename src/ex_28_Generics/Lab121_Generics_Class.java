package ex_28_Generics;

public class Lab121_Generics_Class
{
    public static void main(String[] args)
    {
        GenericClass intObj = new GenericClass<>(5);
        GenericClass strObj = new GenericClass<>("ABCD");

        System.out.println("Integer value :" + intObj.getData());
        System.out.println("String value :" + strObj.getData());

    }
}

class GenericClass<T>
{
    private T data;

    public GenericClass(T data)
    {
        this.data = data;
    }
    public T getData()
    {
        return this.data;
    }

}