package pythonproject1;


import java.util.Random;

public class Responser
{
    String[] mesgparts;
    String result;
    
    public Responser() {
    }
    
    public Responser(final String mesg) {
        this.mesgparts = mesg.split(" ");
    }
    
    public void getAnswer(final String mesg) {
        this.mesgparts = mesg.split(" ");
    }
    
    public boolean helloResponser() {
        return this.mesgparts[0].equals("HELLO");
    }
    
    public String getUserName() {
        return this.mesgparts[1];
    }
    
    public String mathQuestionMaker() {
        String sendmesg = "MATH ";
        final Random randomnum = new Random();
        final int operator = randomnum.nextInt(4);
        final String[] operators = { "+", "-", "*", "/" };
        final int a = randomnum.nextInt(1000);
        final int b = randomnum.nextInt(999) + 1;
        switch (operator) {
            case 0: {
                this.result = String.valueOf(a + b);
                break;
            }
            case 1: {
                this.result = String.valueOf(a - b);
                break;
            }
            case 2: {
                this.result = String.valueOf(a * b);
                break;
            }
            case 3: {
                this.result = String.valueOf(a / b);
                break;
            }
        }
        sendmesg = sendmesg + String.valueOf(a) + " " + operators[operator] + " " + String.valueOf(b);
        return sendmesg;
    }
    
    public boolean mathAnswerJudger() {
        return this.mesgparts[0].equals("ANSWER") && this.mesgparts.length > 1 && this.mesgparts[1].equals(this.result);
    }
}
