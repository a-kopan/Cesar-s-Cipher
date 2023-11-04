class filetest {
    private String value;
    filetest() {
        this.value = "";
    }
    filetest(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public void encrypt(int key) {
        char[] ch = this.getValue().toCharArray();
        String output = "";
        for(char letter:ch) {
            //<65;90> - <97;122>
            for(int i=1;i<=key;i++) {
                letter++;
                if (letter>122) {
                    letter = 97; 
                } else if (letter>90 && letter<97) {
                    letter = 65;
                }
            }
            output+=letter;
        }
        this.setValue(output);
        //UWZGLEDNIJ TYLKO ALFABET
    }
    public void decrypt(int key) {
        char[] ch = this.getValue().toCharArray();
        String output = "";
        //<65;90> - <97;122>
        for(char letter:ch) {
            for(int i=1;i<=key;i++) {
                letter--;
                if (letter<65) {
                    letter = 90; 
                } else if (letter>90 && letter<97) {
                    letter = 122;
                }
            }
            output+=letter;
        }
       this.setValue(output);
    }
    //UWZGLEDNIJ TYLKO ALFABET
}