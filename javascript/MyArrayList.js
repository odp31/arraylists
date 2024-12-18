class MyArrayList {
  constructor() {
    this.data = [];
    this.size = 0;
  }
  add(element) {
    this.data[this.size] = element;
    this.size++;
  }

  get(index) {
    if(index < 0 || index >= this.size) {
      throw new Error("index out of bounds");
    }
    return this.data[index];
  }

  remove(index) {
    if(index < 0 || index >= this.size) {
      throw new Error("index out of bounds");
    }
    for(let i = index; i < this.size - 1; i++) {
      this.data[i] = this.data[i + 1];
    }
    this.size--;
  }

  size() {
    return this.size;
  }

  isEmpty() {
    return this.size === 0;
  }
}

const myList = new MyArrayList();
myList.add("apple");
myList.add("banana");
myList.add("orange");

console.log(myList.get(1));
myList.remove(1);
console.log(myList.size());

