package paquete;

public class Gelatina {
    // Atributos

    String color;
    String sabor;


    // Métodos Getter
    public String getColor(){
        return this.color;
    }

    public String getSabor(){
        return this.sabor;
    }

    // Métodos Setter
    public void setColor(String c){
        this.color = c;
    }

    public void setSabor(String s){
        this.sabor = s;
    }

    // Método para obtener toda la información de nuestros atributos
    public void mostrarInfo(){
        System.out.println("La información de la gelatina es:");
        System.out.println("Sabor es: "+ getSabor());
        System.out.println("Color es: "+ getColor());
    }

}
