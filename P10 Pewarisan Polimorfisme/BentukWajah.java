class BentukWajah{
    /*Membuat sebuah method respons pada class induk
    dimana mengembalikan sebuah nilai String*/
    public String respons(){
        return("Perhatikan reaksi wajah saya\n");
    }
}

    /*Membuat class-class lain dengan turunan
    dari class BentukWajah*/
class Senyum extends BentukWajah{
    public String respons(){
        return("Senyum karena senang\n");
    }
}

class Tertawa extends BentukWajah{
    public String respons(){
        return("Tertawa karena gembira\n");
    }
}

class Marah extends BentukWajah{
    public String respons(){
        return("Kemarahan disebabkan bertengkar\n");
    }
}

class Sedih extends BentukWajah{
    public String respons(){
        return("Sedih disebabkan cemburu\n");
    }
}