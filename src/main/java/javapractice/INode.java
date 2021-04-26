package javapractice;

public interface INode<K> {

    public K getValue();

    public void setValue(K value);

    public INode<K> getNext();

    public void setNext(INode<K> next);

}
