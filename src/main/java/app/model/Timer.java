package app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Timer {
    public Long getNanoTime() {
        return nanoTime;
    }

    public void setNanoTime(Long nanoTime) {
        this.nanoTime = nanoTime;
    }

    private Long nanoTime = System.nanoTime();

    @Qualifier
    public Long getTime() {
        System.out.println(23234);

        return nanoTime;
    }
}
