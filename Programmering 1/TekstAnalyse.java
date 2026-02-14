public class TekstAnalyse {

    private int[] antallTegn=new int[30];

    public TekstAnalyse(String tekst) {
        for (int i = 0; i < tekst.length(); i++) {
            char tegn = tekst.charAt(i);
            tegn = Character.toLowerCase(tegn);
            if (tegn >= 'a' && tegn <= 'z') {
                int index = tegn - 'a'; //think a=0 so a-a=0 0 index
                antallTegn[index]++; //increases with index


            } else if (tegn == 'æ') {
                antallTegn[26]++;

            } else if (tegn == 'ø') {
                antallTegn[27]++;

            } else if (tegn == 'å') {
                antallTegn[28]++;
            } else {
                antallTegn[29]++;


            }

        }
    }
        public int finnTotaltAntallBokstaver(){
            int totalt=0;
            for(int i=0;i<29;i++){
                totalt +=antallTegn[i];//summerer
            }
            return totalt;
        }

        public int finnAntallForskjelligeBokstaver() {
            int forskjellige = 0;
            for (int i = 0; i < 29; i++) {
                if (antallTegn[i] > 0) { //hvis bokstaven eksitstere
                    forskjellige++; //Add 1


                }

            }
            return forskjellige;
        }


    public double finnProsentIkkeBokstaver(){
        int totalt=finnTotaltAntallBokstaver()+antallTegn[29];
        double prosent=(antallTegn[29]*100.0)/totalt;
        return prosent;


        }

        public int finnAntallForekomster(char bokstav){
            bokstav=Character.toLowerCase(bokstav);
            if(bokstav>='a' && bokstav<= 'z'){
                int index=bokstav-'a';
                return antallTegn[index];
                
            } else if(bokstav== 'æ'){
                return antallTegn[26];
                
            }else if (bokstav=='ø'){
                return antallTegn[27];
                
            }else if(bokstav =='å'){
                return antallTegn[28];

            }else{
                return 0;
            }




        }

    }




