package abstracts;

import entities.User;

public interface IPersonService {
	void add(User user) throws Exception;

	void update(User user);

	void delete(User user);
}
