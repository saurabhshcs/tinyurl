# System Design | URL Shortner (bit.ly, TinyURL, etc)
> In the current technological era, efficient and concise URL management is an absolute necessity. URL shortening services, including bit.ly and TinyURL, play a vital role in converting lengthy web addresses into shorter, shareable links. As the demand for these services continues to rise, it is imperative to understand the System Design of URL Shorteners and excel in designing a scalable and reliable URL-shortening system. This skill is absolutely critical for software engineers to possess.

# Requirements for System Design of URL Shortener Service:

## 1.1 Functional Requirements of URL Shortening Service:
The URL shortening service must generate a shorter and unique alias for a long URL provided by the user. When the user clicks on a short link, the service must redirect the user to the original link. The links must expire after a standard default time span.

## 1.2 Non-Functional Requirements of URL Shortening Service:
The system must be highly available to avoid any interruption in the URL redirection service. URL redirection should happen in real-time with minimal latency. Shortened links should not be predictable.

## 2. Capacity Estimation for System Design of URL Shortener:
Assuming that the URL shortening service will receive 30 million new URL shortenings per month, we will need to store every URL shortening request (along with the associated shortened link) for 5 years. This means that the service will generate approximately 1.8 billion records over the 5-year period.

