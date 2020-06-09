package pl.wroc.assa.MyApp;

import org.springframework.stereotype.Service;

@Service
public class MyAppService {

    public boolean isMaleName(String name) {
        if (name.endsWith("a")) {
            return false;
        }
        return true;
    }

}
