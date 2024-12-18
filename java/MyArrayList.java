public class MyArrayList<E> {
  private static final int DEFAULT_CAPACITY = 10;

  private Object[] data;
  private int size;

  public MyArrayList() {
    data = new Object[DEFAULT_CAPACITY];
    size = 0;
  }

  public void add(E element) {
    if(size == data.length) {
      // resize array
      Object[] newData = new Object[data.length * 2];
      System.arraycopy(data, 0, newData, 0, data.length);
      data = newData;
    }
    data[size++] = element;
  }

  public E get(int index) {
    if(index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }
    return (E) data[index];
  }

  public void remove(int index) {
    if(index < 0 || index >= size) {
      throw new IndexOutOfBoundsException();
    }
    // shift elements to left
    System.arraycopy(data, index + 1, data, index, size - index - 1);
    size--;
  }

  public int size() {
    return size;
  }
  public boolean isEmpty() {
    return size == 0;
  }
}
