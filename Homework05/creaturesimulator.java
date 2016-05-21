public class creaturesimulator { 
  public static void main(String[] args) {
   
    creature[] carray = new creature[4];
    carray[0] = new cow();
    carray[1] = new dolphin();
    carray[2] = new guppy();
    carray[3] = new bass();
    
    for (int i = 0; i < (carray.length - 1); i++) {
      carray[i].lifespan();
      carray[i].name();
    }
  }
}

