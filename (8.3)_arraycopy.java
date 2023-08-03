class Hello {

    public static void main(String[] args){
        char[] chArr = {'A','B','C','D'};
        char[] chArr2 = {'D','C','B','A'};

        System.arraycopy(chArr, 0, chArr2, 0, chArr.length);
        
        System.out.println(chArr2);
    }
}

