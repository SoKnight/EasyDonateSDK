package ru.easydonate.easydonate4j.http.client.apache;

import org.jetbrains.annotations.NotNull;
import ru.easydonate.easydonate4j.http.client.AbstractHttpClientBuilder;
import ru.easydonate.easydonate4j.http.client.HttpClient;
import ru.easydonate.easydonate4j.http.client.SimpleTimeouts;

public class ApacheHttpClientBuilder extends AbstractHttpClientBuilder {

    @Override
    public @NotNull HttpClient create() {
        HttpClient.Timeouts timeouts = new SimpleTimeouts(connectTimeout, responseTimeout, readTimeout, writeTimeout);
        return new ApacheHttpClient(userAgent, timeouts, apiEndpoint);
    }

}
