// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.appservice.fluent.models.TldLegalAgreementInner;
import com.azure.resourcemanager.appservice.fluent.models.TopLevelDomainInner;
import com.azure.resourcemanager.appservice.models.TopLevelDomainAgreementOption;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in TopLevelDomainsClient. */
public interface TopLevelDomainsClient {
    /**
     * Get all top-level domains supported for registration.
     *
     * <p>Description for Get all top-level domains supported for registration.
     *
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Top-level domains as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<TopLevelDomainInner> listAsync();

    /**
     * Get all top-level domains supported for registration.
     *
     * <p>Description for Get all top-level domains supported for registration.
     *
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Top-level domains as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TopLevelDomainInner> list();

    /**
     * Get all top-level domains supported for registration.
     *
     * <p>Description for Get all top-level domains supported for registration.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Top-level domains as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TopLevelDomainInner> list(Context context);

    /**
     * Get details of a top-level domain.
     *
     * <p>Description for Get details of a top-level domain.
     *
     * @param name Name of the top-level domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a top level domain object along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<TopLevelDomainInner>> getWithResponseAsync(String name);

    /**
     * Get details of a top-level domain.
     *
     * <p>Description for Get details of a top-level domain.
     *
     * @param name Name of the top-level domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a top level domain object on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<TopLevelDomainInner> getAsync(String name);

    /**
     * Get details of a top-level domain.
     *
     * <p>Description for Get details of a top-level domain.
     *
     * @param name Name of the top-level domain.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a top level domain object along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<TopLevelDomainInner> getWithResponse(String name, Context context);

    /**
     * Get details of a top-level domain.
     *
     * <p>Description for Get details of a top-level domain.
     *
     * @param name Name of the top-level domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a top level domain object.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TopLevelDomainInner get(String name);

    /**
     * Gets all legal agreements that user needs to accept before purchasing a domain.
     *
     * <p>Description for Gets all legal agreements that user needs to accept before purchasing a domain.
     *
     * @param name Name of the top-level domain.
     * @param agreementOption Domain agreement options.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of top-level domain legal agreements as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<TldLegalAgreementInner> listAgreementsAsync(String name, TopLevelDomainAgreementOption agreementOption);

    /**
     * Gets all legal agreements that user needs to accept before purchasing a domain.
     *
     * <p>Description for Gets all legal agreements that user needs to accept before purchasing a domain.
     *
     * @param name Name of the top-level domain.
     * @param agreementOption Domain agreement options.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of top-level domain legal agreements as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TldLegalAgreementInner> listAgreements(String name, TopLevelDomainAgreementOption agreementOption);

    /**
     * Gets all legal agreements that user needs to accept before purchasing a domain.
     *
     * <p>Description for Gets all legal agreements that user needs to accept before purchasing a domain.
     *
     * @param name Name of the top-level domain.
     * @param agreementOption Domain agreement options.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of top-level domain legal agreements as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<TldLegalAgreementInner> listAgreements(
        String name, TopLevelDomainAgreementOption agreementOption, Context context);
}
