package q.open2;

import java.util.ArrayList;

public class Leaf extends Component {
	@Deprecated
	public void add(Component component) throws UnsupportedOperationException {
		// ��ʵ��,ֱ������һ��"��֧������"�쳣
		throw new UnsupportedOperationException();
	}

	@Deprecated
	public void remove(Component component) throws UnsupportedOperationException {
		// ��ʵ��
		throw new UnsupportedOperationException();
	}

	@Deprecated
	public ArrayList<Component> getChildren() throws UnsupportedOperationException {
		// ��ʵ��
		throw new UnsupportedOperationException();
	}
}
