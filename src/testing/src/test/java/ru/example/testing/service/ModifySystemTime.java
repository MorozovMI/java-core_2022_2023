package ru.example.testing.service;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.example.testing.model.Response;
@Service
@RequiredArgsConstructor
@Qualifier("ModifySystemTime")
public class ModifySystemTime implements MyModifyService {

    @Override
    public Response modify(Response response){
        response.setSystemTime("");
        return response;
    }
}
