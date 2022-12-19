package lesson_10_11;

public class Dog {
    private String name;
    private boolean isCollarPutOn;
    private boolean isLeashPutOn;
    private boolean isNuzzlePutOn;

    public Dog(String name) {
        this.name = name;
    }
    public void putCollar(){
        System.out.println("Ошейник надет...");
        this.isCollarPutOn = true;
    }

    public void putLeash(){
        System.out.println("Поводок надет...");
        this.isLeashPutOn = true;
    }
    public void putNuzzle(){
        System.out.println("Намордник надет...");
        this.isNuzzlePutOn = true;
    }

    public void walk() throws DogIsNotReadyToWalkException{
        System.out.println(" Пойдем гулять..");
        if(isNuzzlePutOn && isCollarPutOn && isCollarPutOn){
            System.out.println("Ура, " + name + " , идем гулять!");
        }else{
            throw new DogIsNotReadyToWalkException("Собака не готова гулять..");
        }
    }

}
