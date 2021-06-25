class StaticAccessDemo {
    public static int staticField = 0;

    public int field = 0;

    public static void staticMethod() {}

    public void method() {}

    // 使用上述的属性/方法（包含静态）

    public static void staticContext() {
        StaticAccessDemo.staticMethod(); // 可以使用静态方法
        System.out.println(StaticAccessDemo.staticField);    // 可以使用静态属性
        // 但是不能使用非静态属性和方法
        //this.method();   // 编译错误
        //System.out.println(this.field);  // 编译错误

        // 主要是现在没有一个 指向对象的引用（this）
        // 手动构造对象了，当然就可以了
        StaticAccessDemo a = new StaticAccessDemo();
        System.out.println(a.field);
        a.method();
    }

    public void normalContext() {
        // 可以使用静态属性/方法
        StaticAccessDemo.staticMethod(); // 可以使用静态方法
        System.out.println(StaticAccessDemo.staticField);    // 可以使用静态属性

        // 也可以使用非静态属性和方法
        this.method();
        System.out.println(this.field);
    }

    public static void main(String[] args) {

    }
}
