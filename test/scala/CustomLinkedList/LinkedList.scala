
object TestLinkedList extends App {
  val list = new CustomLists.NonEmptyLinkedList(1, CustomLists.EmptyLinkedList)
  val listV2 = list.add(2)
  println(s"Given list is ${listV2.toString}")
  println(s"Given list is ${CustomLists.EmptyLinkedList.toString}")
}
abstract class LinkedList {
  def head: Int
  def tail: CustomLists.LinkedList
  def isEmpty: Boolean
  def add(newItem: Int): CustomLists.LinkedList
  def toString: String
}

class NonEmptyLinkedList(headItem: Int, tailList: CustomLists.LinkedList) extends CustomLists.LinkedList {
  def head: Int = headItem
  def tail: CustomLists.LinkedList = tailList
  def isEmpty = false
  def add(newItem: Int) = new CustomLists.NonEmptyLinkedList(newItem, this)
  override def toString = s"${this.head} ${this.tailList.toString}"
}

object EmptyLinkedList extends CustomLists.LinkedList {
  def head = throw new NoSuchElementException
  def tail = throw new NoSuchElementException
  def isEmpty = true
  def add(newItem: Int) = new CustomLists.NonEmptyLinkedList(newItem, CustomLists.EmptyLinkedList)

  override def toString: String = ""
}