class MyDate {
    constructor(day,month,year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    getDay(){
       return  this.day;
    }
    getMonth(){
       return  this.month;
    }
    getYear(){
       return  this.year;
    }

    setDay(day){
        this.day = day;
    }
    setMonth(month){
        this.month = month;
    }

    setYear(year){
        this.year = year;
    }
    setDate(day,month,year){
        this.setDay(day);
        this.setMonth(month);
        this.setYear(year);
    }

    toString(){
        return "Hom nay ngay: " + this.getDay() + " thang: " + this.getMonth() + " nam: "+ this.getYear();
    }
}

let dateNow = new MyDate(13,3,2020);
dateNow.setDay(14);
dateNow.setDate(15,3,2020);
alert(dateNow.toString());
