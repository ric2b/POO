package score;

import bayessian.BayessianNetwork;
import bayessian.RandomVariable;
import dataset.Dataset;

public interface Score {
	
	public int getScore(BayessianNetwork<? extends RandomVariable> bayessian, Dataset dataset);
}
