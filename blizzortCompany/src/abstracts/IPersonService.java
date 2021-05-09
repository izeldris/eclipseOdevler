package abstracts;

import entities.User;

public interface IPersonService {
	void add(User user);

	void update(User user);

	void delete(User user);
}
