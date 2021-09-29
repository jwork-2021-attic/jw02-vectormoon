package S185220001.Task3;

public class SelectionSorter implements Sorter {

    private int[] a;
    private String plan = "";

    @Override
    public void load(int[] elements) {
        // TODO Auto-generated method stub
        this.a = elements;    
    }

    private void swap(int i, int j) {
        int temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        plan += "" + a[i] + "<->" + a[j] + "\n";
    }

    @Override
    public void sort() {
        // TODO Auto-generated method stub
        int min = 0;
        for (int i = 0; i < a.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < a.length; j++)
                if (a[min] > a[j]) 
                    min = j;
            if (min != i) swap(min, i);
        }
    }

    @Override
    public String getPlan() {
        // TODO Auto-generated method stub
        return this.plan;
    }
    
}
