package ocf.api.core.modules.interfaces;

public interface IValidator<TRequest> {
	public void validate(TRequest request);

}
