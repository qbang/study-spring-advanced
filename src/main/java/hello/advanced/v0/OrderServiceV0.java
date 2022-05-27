package hello.advanced.v0;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceV0 {
    private final OrderRepostioryV0 orderRepostioryV0;

    public void orderItem(String itemId) {
        orderRepostioryV0.save(itemId);
    }
}
