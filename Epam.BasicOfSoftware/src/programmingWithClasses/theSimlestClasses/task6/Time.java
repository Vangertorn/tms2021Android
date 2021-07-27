package programmingWithClasses.theSimlestClasses.task6;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        if (hours < 0 || hours > 24) {
            this.hours = 0;
        } else this.hours = hours;
        if (minutes < 0 || minutes > 60) {
            this.hours = 0;
        } else this.minutes = minutes;
        if (seconds < 0 || seconds > 60) {
            this.hours = 0;
        } else this.seconds = seconds;

    }
    public void timeInfo(){
        System.out.println(this.hours+" hours."+this.minutes+" minutes."+this.seconds+" seconds");
    }

    public void decreaseTime(int hours, int minutes, int seconds) {
        if ((hours < 0) || hours > 24) {
            System.err.println("Incorrect number hours");
        } else this.hours = this.hours - hours;
        if (this.hours < 0 || this.hours > 24) {
            System.err.println("You broke my class!!!");
            this.hours = 0;
        }
        if (minutes < 0 || minutes > 60) {
            System.err.println("Incorrect number minutes");
        } else this.minutes = this.minutes - minutes;
        if (this.minutes < 0 || this.minutes > 60) {
            System.err.println("You broke my class!!!");
            this.minutes = 0;
        }
        if (seconds < 0 || seconds > 60) {
            System.err.println("Incorrect number minutes");
        } else this.seconds = this.seconds - seconds;
        if (this.seconds < 0 || this.seconds > 60) {
            System.err.println("You broke my class!!!");
            this.seconds = 0;
        }
    }

    public void decreaseTime(int minutes, int seconds) {
        if (minutes < 0 || minutes > 60) {
            System.err.println("Incorrect number minutes");
        } else this.minutes = this.minutes - minutes;
        if (this.minutes < 0 || this.minutes > 60) {
            System.err.println("You broke my class!!!");
            this.minutes = 0;
        }
        if (seconds < 0 || seconds > 60) {
            System.err.println("Incorrect number minutes");
        } else this.seconds = this.seconds - seconds;
        if (this.seconds < 0 || this.seconds > 60) {
            System.err.println("You broke my class!!!");
            this.seconds = 0;
        }
    }

    public void decreaseTime(int seconds) {
        if (seconds < 0 || seconds > 60) {
            System.err.println("Incorrect number minutes");
        } else this.seconds = this.seconds - seconds;
        if (this.seconds < 0 || this.seconds > 60) {
            System.err.println("You broke my class!!!");
            this.seconds = 0;
        }
    }

    public void addTime(int hours, int minutes, int seconds) {
        if ((hours < 0) || hours > 24) {
            System.err.println("Incorrect number hours");
        } else this.hours = this.hours + hours;
        if (this.hours > 24) {
            System.err.println("You broke my class!!!");
            this.hours = 0;
        }
        if (minutes < 0 || minutes > 60) {
            System.err.println("Incorrect number minutes");
        } else this.minutes = this.minutes + minutes;
        if (this.minutes > 60) {
            System.err.println("You broke my class!!!");
            this.minutes = 0;
        }
        if (seconds < 0 || seconds > 60) {
            System.err.println("Incorrect number minutes");
        } else this.seconds = this.seconds + seconds;
        if (this.seconds > 60) {
            System.err.println("You broke my class!!!");
            this.seconds = 0;
        }
    }

    public void addTime(int minutes, int seconds) {
        if (minutes < 0 || minutes > 60) {
            System.err.println("Incorrect number minutes");
        } else this.minutes = this.minutes + minutes;
        if (this.minutes > 60) {
            System.err.println("You broke my class!!!");
            this.minutes = 0;
        }
        if (seconds < 0 || seconds > 60) {
            System.err.println("Incorrect number minutes");
        } else this.seconds = this.seconds + seconds;
        if (this.seconds > 60) {
            System.err.println("You broke my class!!!");
            this.seconds = 0;
        }
    }

    public void addTime(int seconds) {
        if (seconds < 0 || seconds > 60) {
            System.err.println("Incorrect number minutes");
        } else this.seconds = this.seconds + seconds;
        if (this.seconds > 60) {
            System.err.println("You broke my class!!!");
            this.seconds = 0;
        }
    }


    public void setHours(int hours) {
        if (hours < 0 || hours > 24) {
            this.hours = 0;
        } else this.hours = this.hours;
    }

    public void setMinutes(int minutes) {
        if (minutes < 0 || minutes > 60) {
            this.hours = 0;
        } else this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        if (seconds < 0 || seconds > 60) {
            this.hours = 0;
        } else this.seconds = seconds;
    }
    public static int compareTime(Time time, Time time1){
        if (time.hours == time1.hours){
            if(time.minutes == time1.minutes){
                return Integer.compare(time.seconds, time1.seconds);
            }
            return Integer.compare(time.minutes, time1.minutes);
        }
        return Integer.compare(time.hours, time1.hours);
    }

    @Override
    public String toString() {
        return "Time{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }
}
