public class Animals {
    private String Name;
    private String NameLat;
    private String YearOfFound;
    private String color;
    private String Description;
    private Integer count;

    Animals(String[] arr){
        this.Name = arr[0];
        this.NameLat = arr[1];
        this.color = arr[2];
        this.YearOfFound = arr[3];
        this.Description = arr[4];
        //count++;
    }

    public String getColor() {
        return color;
    }

    public void Print(){
        System.out.println("Колір тварини "+Name+ " зараз став: " + getColor());
    }

    public void Print(String all){
        System.out.println("Назва: "+Name);
        System.out.println("Назва латиною: "+NameLat);
        System.out.println("Рік відкриття: "+YearOfFound);
        System.out.println("Колір: "+color);
        System.out.println("Опис: "+Description);

    }

    public void ChangeColor(String newColor){
        if (newColor.length()>0)
            this.color=newColor;
        // Print("All");
    }

}