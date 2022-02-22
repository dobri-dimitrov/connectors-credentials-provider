package com.ontotext.trree.plugin.externalsync.auth.impl;

import com.ontotext.trree.plugin.externalsync.auth.UsernamePasswordProvider;

public class CredentialsProvider implements UsernamePasswordProvider {

    /**
     * Returns the credentials. You can use the {@link SimpleCredentials} class for convenient creation
     * of the {@link Credentials} instance.
     * <p>
     * This method may return NULL to signal no credentials are needed.
     *
     * @param url        the URL of the remote server as provided in the connector definition
     * @param instanceId the ID of the connector instance
     * @return a {@link Credentials} describing the credentials or NULL if no credentials are available.
     */
    @Override
    public Credentials getCredentials(String url, String instanceId) {

        String username = getUsername(url, instanceId);
        String password = getPassword(url, instanceId);

        Credentials credentials = null;
        if (password != null || username != null) {
            //You can create а custom class that implements Credentials
            credentials = new SimpleCredentials(username, password);
        }

        return credentials;
    }

    private String getUsername(String url, String instanceId) {

        //TODO Implement a custom way to get the username

        return null;
    }

    private String getPassword(String url, String instanceId) {

        //TODO Implement a custom way to get the password

        return null;
    }

}
