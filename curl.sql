					curl
`curl` is a command-line tool in Unix and Unix-like operating systems that is used for making network requests, primarily to retrieve data from or send data to various types of servers. It supports multiple protocols, including HTTP, HTTPS, FTP, SCP, and more. Here are some common `curl` commands and their explanations:
1. *HTTP GET Request:*
   - `curl URL`: Perform an HTTP GET request to the specified URL and display the response in the terminal.
2. *HTTP POST Request:*
   - `curl -X POST -d 'data' URL`: Send an HTTP POST request to the URL with the specified data (`-d` flag) in the request body.
3. *HTTP Headers:*
   - `curl -H 'HeaderName: HeaderValue' URL`: Include custom HTTP headers in the request.
4. *HTTP Authentication:*
   - `curl -u username:password URL`: Perform HTTP Basic Authentication by providing a username and password.
5. *Follow Redirects:*
   - `curl -L URL`: Follow HTTP redirects if the requested URL redirects to another location.
6. *Save Output to a File:*
   - `curl -o outputfile URL`: Save the response content to the specified output file.


7. *Download Files:*
   - `curl -O URL`: Download a file from the URL and save it with the same name as the remote file.
8. *Limit Download Speed:*
   - `curl --limit-rate 100k URL`: Limit the download speed to 100 kilobytes per second.
9. *Specify Output Format:*
   - `curl -w 'Response Code: %{http_code}' URL`: Specify a custom output format using the `-w` flag.
10. *Upload Files (HTTP POST):*
    - `curl -F 'file=@localfile' URL`: Upload a local file as part of a multipart/form-data POST request.
11. *Set Timeout:*
    - `curl --max-time 10 URL`: Set a maximum time for the request (e.g., 10 seconds).
12. *Send Data from a File (HTTP POST):*
    - `curl -X POST --data-binary @datafile URL`: Send data from a local file in a POST request.
13. *Insecure SSL/TLS:*
    - `curl -k URL`: Allow connections to SSL/TLS sites without certificates (not recommended for production).
14. *List Available HTTP Methods:*
    - `curl -I -X OPTIONS URL`: Send an HTTP OPTIONS request to list available methods.

15. *Follow Links (Spider):*
    - `curl -I --recursive URL`: Follow links on a webpage recursively (spidering).
16. *Set User Agent:*
    - `curl -A 'UserAgentString' URL`: Set a custom User-Agent header.

These are some common `curl` commands, but `curl` is a versatile tool that can be used for a wide range of network-related tasks. It's particularly useful for scripting and automation when interacting with web services and APIs from the command line.
