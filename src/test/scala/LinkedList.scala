
object TestLinkedList extends App {
  val list = new NonEmptyLinkedList(1, EmptyLinkedList)
  val listV2 = list.add(2)
  println(s"Given list is ${listV2.toString}")
  println(s"Given list is ${EmptyLinkedList.toString}")
}
abstract class LinkedList {
  def head: Int
  def tail: LinkedList
  def isEmpty: Boolean
  def add(newItem: Int): LinkedList
  def toString: String
}

class NonEmptyLinkedList(headItem: Int, tailList: LinkedList) extends LinkedList {
  def head: Int = headItem
  def tail: LinkedList = tailList
  def isEmpty = false
  def add(newItem: Int) = new NonEmptyLinkedList(newItem, this)
  override def toString = s"${this.head} ${this.tailList.toString}"
}

object EmptyLinkedList extends LinkedList {
  def head = throw new NoSuchElementException
  def tail = throw new NoSuchElementException
  def isEmpty = true
  def add(newItem: Int) = new NonEmptyLinkedList(newItem, EmptyLinkedList)

  override def toString: String = ""
}