/**
 * Created by Xiaobin Wang on 2/6/2017.
 */
public class DNAStrand {
    private String a;
    private char[] ww ;
    private char[] wk;
    char[] rw ;
    String wo ;


    public DNAStrand(String dna){
        this.a=dna;
        wk = new char[a.length()];
        ww = new char[a.length()];
        rw = new char[a.length()];
        wo = new String();
    }


    public Boolean isValidDNA() {
        if (a == null || a == "")
            return false;
        String dnaWithoutTCGA = a.replace("T", "").replace("C", "").replace("A", "").replace("G", "");
        return dnaWithoutTCGA.length() == 0;
    }

    public String complementWC(){
        for(int i=0;i<a.length();i++){
            this.ww[i] = a.charAt(i);
            if(this.ww[i]=='A'){
                this.wk[i] = 'T';
            }else if(this.ww[i]=='T'){
                this.wk[i] = 'A';
            }else if(this.ww[i]=='C'){
                this.wk[i] = 'G';
            }else if(this.ww[i]== 'G'){
                this.wk[i] = 'C';
            }
        }
        wo = String.valueOf(wk);
        return wo;

    }

    public String palindromeWC() {
        String comp = complementWC();

        String res = "";
        for (int i = comp.length() - 1; i >= 0; i--) {
            res += comp.charAt(i);
        }
        return res;
    }


    public boolean containsSequence(String seq){
        return a.contains(seq);
    }

    public String toString(){
        return a;

    }




}
