interface camera {
    void clickphoto();
}
interface phone {
    void makeCall();
}

class Smartphone implements camera ,phone {
    public void clickphoto(){
        System.out.println(" photo clocked");
    }

    public void makeCall(){
        System.out.println(" Calling....!!");
    }
}

class Test { 
    public static void main (String[] args){
        Smartphone myphone =new Smartphone();
        myphone.clickphoto();
        myphone.makeCall();

    }
}
/*photo clocked
 Calling....!! */
