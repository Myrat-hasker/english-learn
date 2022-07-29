public class Words{
    String[] engArr;
    String[] rusArr;
    int size;
    int rusNElem = 0;
    int engNElem = 0;
    public Words(int s){
        size = s;
        engArr = new String[size];
        rusArr = new String[size];
    }
    public void add(String engWord, String rusWord){ // dobavleniye v massiw
        engArr[engNElem] = engWord;
        rusArr[rusNElem] = rusWord;
        engNElem++;
        rusNElem++;
    }
    public void addEng(String engWord){
        engArr[engNElem] = engWord;
        engNElem++;
    }
    public void addRus(String rusWord){
        rusArr[rusNElem] = rusWord;
        rusNElem++;
    }
    public void display(){      // obzor massiwa
        for (int i = 0; i < engNElem; i++){
            System.out.println(engArr[i] + " - " + rusArr[i] + ";");
        }
    }
    public void rusDisplay(){      // obzor rus massiwa
        for (int i = 0; i < rusNElem; i++){
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