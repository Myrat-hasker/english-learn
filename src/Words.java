public class Words{ // dobawleniye izmeneniye dliya git
    String[] engArr;
    String[] rusArr;
    int size;
    int nElem = 0;
    public Words(int s){
        size = s;
        engArr = new String[size];
        rusArr = new String[size];
    }
    public void add(String engWord, String rusWord){ // dobavleniye v massiw
        engArr[nElem] = engWord;
        rusArr[nElem] = rusWord;
        nElem++;
    }
    public void display(){      // obzor massiwa
        for (int i = 0; i < nElem; i++){
            System.out.println(engArr[i] + " - " + rusArr[i] + ";");
        }
    }
    public void rusDisplay(){      // obzor rus massiwa
        for (int i = 0; i < nElem; i++){
            System.out.println(rusArr[i] + ";");
        }
    }
    public String getEngString(int val){
        return engArr[val];
    }
    public String getRusString(int val){
        return rusArr[val];
    }
}