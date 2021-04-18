package week03d05;

public class Operation {
    private int leftOperand;
    private int rightOperand;
    private String operation;

    public Operation(String operation) {
        this.operation = operation;
    }

    public int getResult() {
        int position = operation.indexOf("+");
        leftOperand = Integer.parseInt(operation.substring(0, position));
        rightOperand = Integer.parseInt(operation.substring(position + 1));
        return leftOperand + rightOperand;
    }

    public static void main(String[] args) {
        Operation operation = new Operation("16+2");
        System.out.println(operation.getResult());
    }
}
