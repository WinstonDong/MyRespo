package cn.dl.spring5;

public class Orders {

    private String oname;
    private String oaddress;

//    public Orders(String oname, String oaddress) {
//        this.oname = oname;
//        this.oaddress = oaddress;
//    }

    public String getOname() {
        return oname;
    }

    public void setOname(String oname) {
        this.oname = oname;
    }

    public String getOaddress() {
        return oaddress;
    }

    public void setOaddress(String oaddress) {
        this.oaddress = oaddress;
    }
}
