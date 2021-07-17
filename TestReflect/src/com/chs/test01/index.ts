import axios, { AxiosInstance, AxiosRequestConfig, AxiosResponse } from 'axios'

class Request {
    public static instance: AxiosInstance
    /**
     *
     */
    private constructor() { }

    static getInstance() {
        if (!Request.instance) {
            Request.instance = axios.create({
                timeout: 10000,
                baseURL: "/api"
            });
        }
        return Request.instance;
    }

    static initInterceptor() {
        // set header
        Request.instance.defaults.headers.post['Content-Type'] = 'application/json'

        // use interceptors
        // handle request
        Request.instance.interceptors.request.use(
            (config: AxiosRequestConfig) => {
                // handle request
                return config;
            },
            Request.errorHandle
        )
        // handle response
        Request.instance.interceptors.response.use(
            (response: AxiosResponse) => {
                // handle response
                if (response.status !== 200){
                    Request.errorHandle(response)
                }
                return response.data
            },
            (error: any) => {
                // send but not success
                const response = {
                    status: 500,
                    message: error ? 'Request failed' : 'Cannot connect to server',
                    data: error ? error.data : null,
                    level: 'error'
                }
                return Promise.reject(response)
            }
        )


    }
    static errorHandle(error: any): void {
        console.log('error not handle:', error);
    }
}

export default Request.getInstance()