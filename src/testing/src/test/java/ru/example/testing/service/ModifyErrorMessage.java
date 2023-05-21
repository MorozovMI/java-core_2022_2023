package ru.example.testing.service;
import lombok.RequiredArgsConstructor;
import org.mockito.internal.matchers.ArrayEquals;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.example.testing.model.Response;
@Service
@RequiredArgsConstructor
@Qualifier("ModifyErrorMessage")
public class ModifyErrorMessage implements MyModifyService{
    @Override
    public Response modify (Response response){
        response.setErrorMessage("Что-то сломалось");
        return response;
    }


}
