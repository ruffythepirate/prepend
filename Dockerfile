FROM lolhens/ammonite:latest


WORKDIR "/usr/app"
COPY prepend.sc .

RUN ./prepend.sc; exit 0 

ENTRYPOINT ["amm", "/usr/app/prepend.sc"]
