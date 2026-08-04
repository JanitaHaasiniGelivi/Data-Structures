package Stacks;

public class DynamicStack extends Stack {

    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) {

        if (isFull()) {

            // Double the array size
            int[] temp = new int[data.length * 2];

            // Copy old elements
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        return super.push(item);
    }
}