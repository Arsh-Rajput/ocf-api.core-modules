package ocf.api.core.modules.interfaces;

public interface IRequestHandler<TRequest, UResponse> {
	public UResponse handle(TRequest request) throws Throwable;
}
