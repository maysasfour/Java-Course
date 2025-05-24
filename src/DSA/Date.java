package DSA;

public class Date {
        private int day,month,year;
        @Override
        public String toString(){return this.day+" / "+this.month+" / "+this.year;}

        public void setDate(int day, int month, int year)
        {
            if(day > 0 && day<32)
                this.day=day;
            else this.day=1;
            if(month > 0 && month<13)
                this.month=month;
            else
                this.month=1;
            if(year > 1900 && year<2099)
                this.year=year;
            else
                this.year=1900;
        }

        public Date(int day, int month, int year) {
            this.setDate(day, month, year);
        }

        public int getDay() {
            return day;
        }

        public int getMonth() {
            return month;
        }

        public int getYear() {
            return year;
        }
}
