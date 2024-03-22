public class BRuangKBT {
    private String name;

    BRuangKBT(String name){
        this.name = name;
    }

    public void inputNilai(){
        System.out.println("Memasukkan Nilai");
    }

    public void luasPermukaan(){
        System.out.println("Menghitung Luas Permukaan"+ name);
    }

    public void volume (){
        System.out.println("Menghitung volume bangun" + name);
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

