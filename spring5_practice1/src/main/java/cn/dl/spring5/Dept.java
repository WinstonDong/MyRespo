package cn.dl.spring5;

public class Dept {

    private String dname;

    public Dept(){
        System.out.println("老子是构造方法");
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
        System.out.println("老子调用set了");
    }

    public void initMethod(){
        System.out.println("老子init了");
    }

    public void destroyMethod(){
        System.out.println("老子被destroy了");
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}


