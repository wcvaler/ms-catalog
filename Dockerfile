# Start with OL runtime.
FROM open-liberty
ADD --chown=1001:0  target/catalog.tar.gz   /opt/ol
COPY  resources/CustomConfigSource.json /output/resources/