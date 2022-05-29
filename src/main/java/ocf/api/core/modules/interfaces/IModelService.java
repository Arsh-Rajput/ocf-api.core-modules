package ocf.api.core.modules.interfaces;

public interface IModelService<TRequest, UResponse> {
	public UResponse process(TRequest request);

}
